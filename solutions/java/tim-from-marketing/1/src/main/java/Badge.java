class Badge {
    public String print(Integer id, String name, String department) {
       String mdepartment;
        if(department == null)
        { mdepartment = "OWNER";} else{
             mdepartment = department.toUpperCase();
        }
        if(id == null && department == null){
        return name +" - "+mdepartment;
       } else if(id == null){
        return String.format("%s - %s", name, mdepartment) ;
       } else if(name == null){
        return String.format("[%d] - %s", id, mdepartment) ;
       } else if(department == null){
        return String.format("[%d] - %s - %s", id, name, mdepartment) ;
       }else{
        return String.format("[%d] - %s - %s", id, name, mdepartment) ;
       }
        
    }
}
