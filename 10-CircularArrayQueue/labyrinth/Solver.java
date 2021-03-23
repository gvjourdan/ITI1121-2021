public class Solver {

    public static String solve(Labyrinth labyrinth) {


        Queue<String> q = new LinkedQueue<String>();
        q.enqueue("");
        boolean found = false;
        while(!q.isEmpty()){
            String s = q.dequeue();
            if(labyrinth.checkPath(s)){
            	if(labyrinth.reachesGoal(s)){
            		return s;
            	} else {
		            q.enqueue(s+"U");
		            q.enqueue(s+"D");
		            q.enqueue(s+"L");
		            q.enqueue(s+"R");            		
            	}
            }
        }
        return null;
    }

}
