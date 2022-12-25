public class task_6_1 {
    public static void main(String[] args) {
    ArrayList<Integer> user_list = new ArrayList<>(1000);
    for (int i = 0; i < 1000; i++) {
        user_list.add(new Random().nextInt(25));
    }
    System.out.printf("Процент уникальных значений %s%s", uniqueNum(user_list), "%");
    }
    
    public static double uniqueNum(ArrayList<Integer> list) {
    HashSet<Integer> new_set = new HashSet<>(list);
    return ((double) new_set.size() / (double) list.size()) * 100;
    }
}