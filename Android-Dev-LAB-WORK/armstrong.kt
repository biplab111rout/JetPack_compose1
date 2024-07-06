fun main() {
    
    val a= 370
    var temp =a
    
    var s=0;
    
    while(temp!=0)
    {
        var r=temp%10
        r=r*r*r
        s=s+r
        temp=temp/10
        
    }
    
    if(s==a)
    {
        println("Armstrong number")
    }
    else
    {
        println("Not a Armstromg number")
    }
    
    
    
}
