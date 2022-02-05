# java-new-features
Java new features (Java8, Java9, Java10, Java11, Java12, Java13, Java14)


# Java 9

- private method inside Interface
- effective final with try-with-resource -> resource as dependency can be passed as an argument in try(resource). No need to say try(Resource resource = new Resource)
- variable with name underscore ( _ ) not allowed now
- Stream
    - takeWhile(Predicate) -> It is like door open now and close in future
    - dropWhile(Predicate) -> It is like door close now and open in future
- IntStream iterate()
   - with bounds
   - without bounds
- Optional
   - ifPresentOrElse() -> It is new method to get Optional value
   - or()
   - stream()
- Collectors
   - filtering()
   - flatMapping()
- CompletableFuture
   - completeOnTimeout()
   - orTimeout() 
- List.of(), Set.of(), Map.of() methods to create immutable collections
- Annonymous inner class with diamond <> operator
- JShell -> REPL(Read Evaluate Print Loop) for java
- Modules


# Java 10

- local variable type inference
- Optional
  - orElseThrow()
- Collectors
  - toUnmodifiableList()
  - toUnmodifiableSet()
  - toUnmodifiableMap()
- List.copyOf(), Set.copyOf() and Map.copyOf() methods

# Java 11

- var for lambda local variables
