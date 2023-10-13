package fit.iuh.edu.vn.emums;

public enum SkillType {

    SOFT_SKILL(1),
    UNSPECIFC(0),
    TECHNICAL_SKILL(-1)  ;

    private int value;

    SkillType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
