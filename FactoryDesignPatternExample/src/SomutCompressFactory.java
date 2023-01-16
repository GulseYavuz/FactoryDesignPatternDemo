public class SomutCompressFactory {
    public Compressing getType(String compressType){
        if(compressType == null){
            return null;
        }else if (compressType.equals("RAR")){
            return new RAR();
        } else if (compressType.equals("ZIP")) {
            return new ZIP();
        }else if (compressType.equals("TAR")){
            return new TAR();
        }
        return null;
    }
}
