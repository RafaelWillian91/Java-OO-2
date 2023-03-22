package record;

public record PersonRecord(String firstName, String lastName,int age) {

        private static int i =0;

        public PersonRecord getNome(){
            return new PersonRecord(firstName, lastName, i);
        }


}
