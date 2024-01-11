import { lazy } from 'react'
import { Route } from "react-router";
import { BrowserRouter, Routes } from "react-router-dom";
import './App.css'
import React from 'react';

function App() {
  const homePage = lazy(() => import("./pages/Home"));

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
        <Route
            path="Home"
            element={lazyElement(homePage)}
        >
          
        </Route>
      </Routes>
    </BrowserRouter>
  )
}

export default App
