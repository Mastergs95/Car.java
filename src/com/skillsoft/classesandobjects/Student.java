package com.skillsoft.classesandobjects;

public class Student {

        private int id;
        private String name;
        private double gpa;

        public Student(int id, String name, double gpa){

            this.id=id;
            this.name=name;
            this.gpa=gpa;
        }

        public void printStudentInfo(){

            System.out.println();
            System.out.println("ID:" + id + " Name:" + name + " GPA:" + gpa);
            System.out.println("ID:" + this.id + " Name:" + this.name + " GPA:" + this.gpa);

        }

        public int getId(){
            return id;
        }

        public String getName(){
            return name;
        }

        public double getGpa(){
            return gpa;
        }

        public void setId(int id){
            this.id=id;
        }

        public void setName(String name){
            this.name=name;
        }

        public void setGpa(double gpa){
          this.gpa=gpa;
        }

}
