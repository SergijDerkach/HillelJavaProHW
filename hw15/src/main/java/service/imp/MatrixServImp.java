package service.imp;

import service.interf.MatrixServ;

public class MatrixServImp implements MatrixServ {
        @Override
    public String getValue(int pl, int comp,String [][] m) {
        return m[pl][comp];
    }
}
