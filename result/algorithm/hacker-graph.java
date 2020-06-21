/**
 * 深度优先遍历图
 */
public static int dfs (int source) {
        int $count = 1;
        visited[source]=true;
        for (int i:graph.get(source)) {
            if (!visited[i])
                $count+=dfs(i);
        }
        return $count;
}

/**
 * 广度优先遍历图
 */

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add($firstNode);

        while (!pq.isEmpty()) {
            Node V = pq.poll();

            for (Edge<Integer> adj : G.adj(V.key)) {
                int w = adj.other(V.key);
                if (marked[w]) continue;
                if ($boundaryCondition) {

                    pq.add(w);
            }
        }
           $otherOperation;
        }