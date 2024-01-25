import { lazy } from 'react'
import { Route } from "react-router";
import { BrowserRouter, Routes } from "react-router-dom";
import './App.css'
import React from 'react';
import Default from './layouts/Default.tsx';
import { useKeycloak } from '@react-keycloak/web';
import { useDispatch } from 'react-redux';
import { setCredentials } from './features/authSlice.ts';

function App() {
  const homePage = lazy(() => import("./pages/Home"));
  const settingsPage = lazy(() => import("./pages/Settings.tsx"));
  const forumGridPage = lazy(() => import("./pages/ForumGridPage.tsx"));
  const welcomePage = lazy(() => import("./pages/WelcomePage.tsx"));

  const { keycloak } = useKeycloak(); // Minden adat ami a keycloakból érkezik lekérdezhető a "keycloak" változóból
  const dispatch = useDispatch(); // A presistance store-ba tárolás

  const lazyElement = (
    Component: React.LazyExoticComponent<() => JSX.Element>
  ) => {
    return (
      <React.Suspense
        fallback={
          <div className="loading">
            Loading...
          </div>
        }
      >
        <Component />
      </React.Suspense>
    );
  };

  if(keycloak?.token) {
    console.log(keycloak.token) //token a keycloakból
    dispatch( // függvényhívás
      setCredentials({  // setter a Credentialshez
        access_token: keycloak?.token,
        user: keycloak?.tokenParsed?.preferred_username,
      })
    )
  }

  return (
    <BrowserRouter>
      <Routes>
        <Route path='' element={lazyElement(welcomePage)}>
        </Route>
        <Route element={<Default />}>
          <Route
            path="home"
            element={lazyElement(homePage)}
          >
          </Route>
          <Route
            path="settings"
            element={lazyElement(settingsPage)}
          >
          </Route>
        </Route>
        <Route
          path='forumGrids'
          element={lazyElement(forumGridPage)} 
        >
        </Route>
      </Routes>
    </BrowserRouter>
  )
}

export default App
