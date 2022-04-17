package com.github.javamultiplex.demo;

import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 14/04/22 12:31 AM
 * @copyright github.com/javamultiplex
 */
public class JavaSealedClassTest {

    public abstract sealed class Human permits Engineer, Doctor {
        protected abstract void occupation();
    }

    public final class Engineer extends Human {

        @Override
        protected void occupation() {
            System.out.println("Working as a Software Engineer");
        }
    }

    public abstract non-sealed class Doctor extends Human {

    }

    public class Dentist extends Doctor {

        @Override
        protected void occupation() {
            System.out.println("Working as a Dentist");
        }
    }

    @Test
    public void shouldCreateObject(){
        Human engineer=new Engineer();
        engineer.occupation();

        Doctor doctor=new Dentist();
        doctor.occupation();
    }

}
