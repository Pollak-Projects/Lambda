import Keycloak from "keycloak-js";
const keycloak = new Keycloak({
    url: "http://berryez.xyz:7777",
    realm: "lambda-realm",
    clientId: "lambda-client",
});

export default keycloak;