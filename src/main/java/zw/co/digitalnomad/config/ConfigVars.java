package zw.co.digitalnomad.config;

import com.uchuhimo.konf.ConfigSpec;
import com.uchuhimo.konf.RequiredItem;

public class ConfigVars {
    public static final ConfigSpec spec = new ConfigSpec("dev");

    public static final RequiredItem<String> dbUrl = new RequiredItem<>(spec, "db");
    public static final RequiredItem<Integer> serverPort = new RequiredItem<>(spec, "port");
    public static final RequiredItem<String> jwtSignature = new RequiredItem<>(spec, "signature");
}
