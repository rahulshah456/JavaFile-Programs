class VolumeMethodOverload
{
    static double volume(double side)
    {
        return side*side*side;
    }

    static double volume(double radius, double height)
    {
        return 3.142*radius*radius*height;
    }

    static double volume(double length, double breadth, double height)
    {
        return length*breadth*height;
    }

    public static void main(String args[])
    {
        double v_cube, v_cylinder, v_cuboid;
        v_cube = volume(4);
        v_cylinder = volume(3,4);
        v_cuboid = volume(2,3,4);

        System.out.println("The volume of :");
        System.out.println("Cube " + v_cube);
        System.out.println("Cylinder " + v_cylinder);
        System.out.println("Cuboid " + v_cuboid);
    }
}