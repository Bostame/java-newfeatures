import java.util.concurrent.CompletableFuture;

public class Ex3ExceptionallyCompose {
    public static void main(String[] args) {
        CompletableFuture<Integer> completableFuture = CompletableFuture
                .supplyAsync(() -> {
                    return 10 / 0;
                });
        CompletableFuture<Integer> completableFuture2 = CompletableFuture
                .supplyAsync(() -> 1);

        CompletableFuture<Integer> exceptionallyCompose = completableFuture
                .exceptionallyCompose(throwable -> {
                    System.err.println("exception: " + throwable);
                    return completableFuture2;
                });
        exceptionallyCompose.thenApply(i -> i * 3)
                            .thenAccept(System.out::println);
    }
}