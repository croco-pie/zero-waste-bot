package services;

import dto.MaterialCodesDTO;
import persistence.entities.v1.MaterialCodes;

import java.util.List;

public class MaterialCodesService {

    private MaterialCodesDTO materialCodesDTO = new MaterialCodesDTO();

    public MaterialCodesService() {
    }

    public List<MaterialCodes> findAllMaterialCodes() {
        List<MaterialCodes> codesAll = materialCodesDTO.findAll();
        return codesAll;
    }
}
