import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App.tsx'
import { Provider } from "react-redux";
import './index.css'
import { store } from './app/store.ts';
import {ColorModeScript} from "@chakra-ui/react";
import {chakraCustomTheme} from "./chackra-ui/chackra-ui.theme.ts";
import {ChackraUiProvider} from "./chackra-ui/chackra-ui.provider.tsx";

ReactDOM.createRoot(document.getElementById('root')!).render(
  <React.StrictMode>
    <Provider store={store}>
        <ColorModeScript initialColorMode={chakraCustomTheme.config.initialColorMode} />
        <ChackraUiProvider>
            <App />
        </ChackraUiProvider>
    </Provider>
  </React.StrictMode>,
)
