import ReactDOM from 'react-dom/client'
import App from './App.tsx'
import { Provider } from "react-redux";
import './index.css'
import { store } from './app/store.ts';
import {ColorModeScript} from "@chakra-ui/react";
import {chakraCustomTheme} from "./chackra-ui/chackra-ui.theme.ts";
import {ChackraUiProvider} from "./chackra-ui/chackra-ui.provider.tsx";
import { ReactKeycloakProvider } from '@react-keycloak/web';
import keycloak from "./types/Keycloak.ts";

ReactDOM.createRoot(document.getElementById('root')!).render(
  <ReactKeycloakProvider    // Meg kell adni a Keycloak Providert, hogy használni tudjuk loginra
      authClient={keycloak} // Egy auth file amiben szerepel az url stb
      initOptions={{ onLoad: "login-required" }}  // extra options
  >
    <Provider store={store}>
        <ColorModeScript initialColorMode={chakraCustomTheme.config.initialColorMode} />
        <ChackraUiProvider>
            <App />
        </ChackraUiProvider>
    </Provider>
  </ReactKeycloakProvider>,
)
