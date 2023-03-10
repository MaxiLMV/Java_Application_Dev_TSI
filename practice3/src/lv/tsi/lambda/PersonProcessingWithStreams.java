package lv.tsi.lambda;

class PersonProcessingWithStreams {
    public static void main(String[] args) {
        PersonEvaluator.l.add(new Person("Max", 28));
        PersonEvaluator.l.add(new Person("Peter", 22));
        PersonEvaluator.l.add(new Person("Anna", 28));
        PersonEvaluator.l.add(new Person("Lilianna", 16));
        PersonEvaluator.l.add(new Person("Pamela", 13));
        PersonEvaluator.l.add(new Person("David", 22));
        PersonEvaluator.findAndPrint(PersonEvaluator.l);
        PersonEvaluator.groupAndPrint(PersonEvaluator.l);
        PersonEvaluator.getAverageAge(PersonEvaluator.l);
    }
}
