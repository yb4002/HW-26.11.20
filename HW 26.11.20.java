  
Targil:
1. Create a String variable called "id" with your id
2. Create a String variable called "full_name" with your full name
3. Create a String variable called "address" with your address
4. create a String variable called "details" with id + full_name + address + details 
5. print details to string
6. add spaces between id and full_name and address and details ...
7. *etgar: 
   create String fname variable and read from the keyboard the first name of the user
   create String lname variable and read from the keyboard the last name of the user
   then print the user first_name and last name in one line...

 String id = "123456789";
        String full_name = "yoram biton";
        String address = "Etrog 65";
        String details = id + " " + full_name + " " + address;
        System.out.println("details: " +  details);

        Scanner s  =  new Scanner(System.in);
        String fname = s.nextLine();

