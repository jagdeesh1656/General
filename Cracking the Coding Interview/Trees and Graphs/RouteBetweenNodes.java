public class RouteBetweenNodes
{
	public enum State { Unvisited, Visited, Visiting; }

	public boolean breadthFirstSearch (Graph g, Node start, Node end)
	{
		if (start == null) return true;

		LinkedList<Node> queue = new LinkedList<Node>();

		for (Node node : nodes)
		{
			n.State = Unvisited;
		}

		start.State = Visiting;

		queue.add(start);

		while (!queue.isEmpty())
		{
			Node n = queue.delete();
			if (n != null)
			{
				
				for (Node v : n.neighbors())
				{
					if (v.state == Unvisited)
					{
						if v == end
							return true
						else
							v.state = Visiting;
							queue.add(v);
					}
				}

				n.State = Visited;
			}
		}
	}

	public boolean depthFirstSearch(Graph g, Node start, Node end)
	{
		if (start == null)
			return true;

		for (Node n : nodes)
		{
			n.state = State.Unvisited;
		}

		Stack<Node> stack = new Stack<Node>();
		stack.push(start);

		while (!stack.isEmpty())
		{
			Node n = stack.pop();
			if (n!=null)
			{
				n.state = State.Visited;

				for (Node v : n.getChildren())
				{
					if (v.state == State.Unvisited)
					{
						if (v == end)
							return true;
						else
						{
							v.state = State.Visited;
							if (v.hasChildren())
							{
								stack.push(v.getChildren());
							}
						}
					}
				}
			}
		}

	}

	public static void main(String args[])
	{

	}
}