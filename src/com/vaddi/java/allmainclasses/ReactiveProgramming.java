package com.vaddi.java.allmainclasses;
import reactor.core.publisher.Flux;
/**
 * Mono - Single or zero
 * Flux - zero or more Stream
 * @param args
 */
import reactor.core.publisher.Mono;
public class ReactiveProgramming {

	public static void main(String[] args) {
		
		Mono<String> mono = Mono.just("Hello Mono");
		mono.subscribe(System.out::println);
		
		
		Flux<String> flux = Flux.just("Hello", "Flux", "World");
        flux.subscribe(System.out::println);
		
        Mono<String> monoWithError = Mono.error(new RuntimeException("An error occurred"));

        // Handle the error and provide a fallback value
        monoWithError
            .onErrorResume(e -> Mono.just("Fallback value"))
            .subscribe(System.out::println);
        
        
        Flux<String> fluxWithError = Flux.error(new RuntimeException("An error occurred"));

        // Handle the error and provide a fallback value
        fluxWithError
            .onErrorResume(e -> Mono.just(" Flux Fallback value"))
            .subscribe(System.out::println);
        
        Flux<String> flux1 = Flux.just("Hellowewqe", "Reactiveww", "Worldewew")
        	    .map(String::toUpperCase)
        	    .filter(s -> s.length() > 5);

        	flux1.subscribe(System.out::println);
	}

}
