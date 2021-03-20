package persistence.entities.v1.enums;

import lombok.Data;

@Data
public class CodeName {
    public enum CodeNameEnum {

        PET("PET", "ПЭТ", "PETE", "ПЭТФ"),
        OTHER("OTHER", "", "", ""),
        PAP("PAP", "", "", ""),
        FE("FE", "", "", ""),
        ALU("ALU", "", "", ""),
        GL("GL", "", "", ""),
        TETRAPAK("TETRAPAK", "ТЕТРАПАК", "", ""),
        NOCODE("", "", "", "");

        private String engName;
        private String rusName;
        private String extraName1;
        private String extraName2;

        CodeNameEnum(String engName, String rusName, String extraName1, String extraName2) {
            this.engName = engName;
            this.rusName = rusName;
            this.extraName1 = extraName1;
            this.extraName2 = extraName2;
        }
    }
}
