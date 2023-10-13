abstract class Vehicle1
{
    public abstract int getWheel();
    public String toString()
    {
        return "Wheel: " + this.getWheel();
    }
}

class Car1 extends Vehicle1
{
    int wheel;
    Car1(int wheel)
    {
        this.wheel = wheel;
    }

    @Override
    public int getWheel()
    {
        return this.wheel;
    }
}

class Bike1 extends Vehicle1
{
    int wheel;
    Bike1(int wheel)
    {
        this.wheel = wheel;
    }

    @Override
    public int getWheel()
    {
        return this.wheel;
    }
}

class VehicleFactory
{
    public static Vehicle getInstance(String type, int wheel)
    {
        if(type == "car")
        {
            return new Car1(wheel);
        }
        else if(type == "bike")
        {
            return new Bike1(wheel);
        }
        return null;
    }
}

public class FactoryPattern
{
    public static void main(String[] args)
    {
        Vehicle car = VehicleFactory.getInstance("car", 4);
        System.out.println(car);

        Vehicle bike = VehicleFactory.getInstance("bike", 2);
        System.out.println(bike);
    }
}