import { lazy } from 'react'
import { Route } from "react-router";
import { BrowserRouter, Routes } from "react-router-dom";
import './App.css'
import React from 'react';
import Default from './layouts/Default.tsx';

function App() {
  const homePage = lazy(() => import("./pages/Home"));
  const settingsPage = lazy(() => import("./pages/Settings.tsx"));
  const forumGridPage = lazy(() => import("./pages/ForumGridPage.tsx"))

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

  return (
    <BrowserRouter>
      <Routes>
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
