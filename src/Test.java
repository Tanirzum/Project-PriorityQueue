import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) {
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();
        Student tanirbergen = new Student("Tanirbergen", 3);
        Student zhanibek = new Student("Zhanibek", 2);
        Student aman = new Student("Aman", 5);
        Student almas = new Student("Almas", 4);

        priorityQueue.add(tanirbergen);
        priorityQueue.add(zhanibek);
        priorityQueue.add(aman);
        priorityQueue.add(almas);

        // Здесь не сортируется по приоритету
        System.out.println(priorityQueue);

        // Здесь сортируется по приоритету и удаляется
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());

        System.out.println(priorityQueue);
    }
}
