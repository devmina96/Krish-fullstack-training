public class Factory {

    public static Packages selectPackage(PackageCode packageCode){

        switch (packageCode){

            case BASIC:
                return new Basic();

            case PREMIUM:
                return new Premium();

            case PLATINUM:
                return new Platinum();

            default:
                return null;
        }

    }
}
