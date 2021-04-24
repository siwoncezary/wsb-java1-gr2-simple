package pl.wsb.enums;

public enum Direction {
    //public static final Direction UP = new Direction("W");
    UP("W"), DOWN("S"), LEFT("A"), RIGHT("D");
    private String strCode;
    Direction(String strCode){
        this.strCode = strCode;
    }

    public String getStrCode() {
        return strCode;
    }

    public static Direction of(String strCode){
        for (Direction d: Direction.values()){
            if (d.strCode.equals(strCode)){
                return d;
            }
        }
        //return null;
        throw new IllegalArgumentException("Nie ma takiej stałej");
    }
}
