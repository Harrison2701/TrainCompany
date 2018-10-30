public class Journey
{
    private String routeCode;
    // A unique identifier for a particular route
    private int delay;
    // Minutes late in arriving at the destination
    private boolean weatherRelated;
// Equals true if the journey is affected by the weather,
// otherwise false.
// Constructor which initializes all 3 of the above data items
// accessor and mutator methods.

    public Journey(String routeCode, int delay, boolean weatherRelated){
        this.routeCode = routeCode;
        this.delay = delay;
        this.weatherRelated = weatherRelated;
    }

    public int getDelay(){
        return this.delay;
    }

    public boolean getWeatherRelated(){
        return this.weatherRelated;
    }

    public String getRouteCode(){
        return this.routeCode;
    }
}