package pl.wsb.lambda;

public class LambdaDemo {
    public static void main(String[] args) {
        //przykład lambdy rozbudowanej
        RGB rgb = (r, g, b) -> {
          int result = 0;
          result += r * 0xFFFF;
          result += g * 0xFF;
          result += b;
          return result;
        };
        //przykład lambdy z jednym argumentem
        StringProcessor substring = str -> str.length() > 3 ? str.substring(3) : str;
        //Przykład lambdy bez argumentu
        Runnable run = () -> System.out.println("Hello");
        System.out.println(substring.process("ABCD"));

        //Przykład referencji do metody
        //StringProcessor trim = str -> str.trim();
        StringProcessor trim = String::trim;

        String pattern ="ABCDEF";
        //StringProcessor replacedString = str -> pattern.concat(str);
        StringProcessor replacedString = pattern::concat;
        run.run();

    }
}
