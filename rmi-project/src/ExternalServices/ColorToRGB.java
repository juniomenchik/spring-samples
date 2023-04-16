package ExternalServices;

public class ColorToRGB {
    public static String colorToRGB(String resp) {
        resp = resp.toLowerCase();
        String[] colors = resp.split(" ");

        for (String color : colors) {
            switch (color) {
                case "red":
                    return  "255 0 0 ";
                case "green":
                    return "0 255 0 ";
                case "blue":
                    return "0 0 255 ";
                case "yellow":
                    return "255 255 0 ";
                case "pink":
                    return "255 0 255 ";
                case "cyan":
                    return "0 255 255 ";
                case "white":
                    return "255 255 255 ";
                case "black":
                    return "0 0 0 ";
                default:
                    return "NO CONOSCO ESTA COLOR: " + color + "";
            }
        }
        return "FINALIZADO !";
    }
}
