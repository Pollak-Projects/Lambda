package hu.szakkor.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        servers = { @Server(url = "http://localhost:8800") },
        info = @Info(title = "Forum Service APIs", description = "Minden API endpoint " +
                "a forum servicehez", version = "v1.0")
)
public class OpenAPI3Configuration {
}
