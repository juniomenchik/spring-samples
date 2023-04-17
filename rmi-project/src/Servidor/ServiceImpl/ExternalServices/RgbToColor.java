package Servidor.ServiceImpl.ExternalServices;

public class RgbToColor {
    public static String rgbToColor(String resp) {
        resp = resp.toLowerCase();
            switch (resp) {
                case "255 0 0":
                    return "red";
                case "0 255 0":
                    return "green";
                case "0 0 255":
                    return "blue";
                case "255 255 0":
                    return "yellow";
                case "255 0 255":
                    return "pink";
                case "0 255 255":
                    return "cyan";
                case "255 255 255":
                    return "white";
                case "0 0 0":
                    return "black";
                default:
                    return "NO CONOSCO ESTA COLOR: " + resp + "";
            }
    }
}
