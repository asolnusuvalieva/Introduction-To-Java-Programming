public class SortComparableObjects {
    public static void main(String[] args) {
        String[] cities = {"Savannah", "Boston", "Atlanta", "Tampa"};
        java.util.Arrays.sort(cities);
        for (String city: cities)
            System.out.print(city + " ");
        System.out.println();
    }
}
