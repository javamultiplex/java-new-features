# java-new-features
Java new features (Java8, Java9, Java10, Java11, Java12, Java13, Java14)


# Java 9

- private method inside Interface
- try-with-resource enhancement -> resource as dependency can be passed as an argument in try(resource). No need to say try(Resource resource = new Resource)
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

