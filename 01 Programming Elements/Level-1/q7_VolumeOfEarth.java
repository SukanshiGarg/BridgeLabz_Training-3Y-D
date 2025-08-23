public class q7_VolumeOfEarth {
    public static void main(String[] args) {
        int r=6378;
        double volInKms=(4/3)*3.14*r*r*r;
        double volInMiles=volInKms/1.6;
        System.out.println("The volume of the Earth in cubic kms is"+ volInKms+" kms and cubic miles is "+ volInMiles+"miles");
        
    }
}
