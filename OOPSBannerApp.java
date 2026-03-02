/**
 * OOPSBannerApp UC7 - Store Character Pattern in a Class
 * @author Harry Jay William
 * @version 7.0
 */
public class OOPSBannerApp {

    // Inner class to encapsulate character and pattern
    static class CharacterPatternMap {
        private Character character;
        private String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() { return character; }
        public String[] getPattern() { return pattern; }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] maps = new CharacterPatternMap[4];
        maps[0] = new CharacterPatternMap('O', new String[]{ "  **** ", " * *", " * *", " * *", " * *", " * *", "  **** " });
        maps[1] = new CharacterPatternMap('P', new String[]{ " **** ", " * * ", " * * ", " **** ", " * ", " * ", " * " });
        maps[2] = new CharacterPatternMap('S', new String[]{ "  **** ", " * ", " * ", "  **** ", "      *", "      *", " **** " });
        maps[3] = new CharacterPatternMap(' ', new String[]{ "       ", "       ", "       ", "       ", "       ", "       ", "       " });
        return maps;
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return charMaps[3].getPattern(); // Return space pattern if not found
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        int patternHeight = charMaps[0].getPattern().length;
        for (int line = 0; line < patternHeight; line++) {
            StringBuilder sb = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                sb.append(pattern[line]).append(" ");
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        printMessage("OOPS", charMaps);
    }
}