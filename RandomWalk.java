public class RandomWalk
{
    // Instance Variables
    private int x;  // x coordinate of the current position
    private int y;  // y coordinate of the current position
    private int maxSteps;   // maximum number of steps in the walk
    private int numbSteps;  // number of steps taking so far in the walk
    private int boundary;   // boundary of the square

    public RandomWalk(int maxSteps, int edge)
    {
        """
        This is a 1/2 contructors. The x and y coordinates and numbsteps
        should be set to 0.
        """
        this.maxSteps = maxSteps;
        this.boundary = edge;
        this.x = 0;
        this.y = 0;
        this.numbSteps = 0;
    }

    public RandomWalk(int maxSteps, int edge, int startX, int startY)
    {
        """
        This a 2/2 constructors. It initializes parameters for their maximums including
        the starting positions
        
        NOTE: WALK AS NOT STARTED YET, therefore numbSteps = 0
        """
        this.maxSteps = maxSteps;
        this.boundary = edge;
        this.x = startX;
        this.y = startY;
        this.numbSteps = 0;
    }

    public String toString()
    {
        """
        This is a public toString method.
        """
        return "Steps: " + numbSteps + ";" + "Position: (" + x +", " + y + ")";
    }
}
