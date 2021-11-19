package zw.co.digitalnomad;

import com.uchuhimo.konf.BaseConfig;
import com.uchuhimo.konf.Config;
import io.javalin.Javalin;
import zw.co.digitalnomad.config.ConfigVars;

import static io.javalin.apibuilder.ApiBuilder.*;

public class Index {
    public static Config config = new BaseConfig();

    public static void main(String[] args) {
        Javalin app = Javalin.create(javalinConfig -> {
            javalinConfig.enableCorsForAllOrigins();
            javalinConfig.accessManager(((handler, ctx, routeRoles) -> {
                handler.handle(ctx);
            }));
        });

        // Routes
        app.routes(() -> {
            path("api", () -> path("v1", () -> {

            }));
        });

        app.start(8001);
    }
}
