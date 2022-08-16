import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;

public class Nada {
    public static void main(String[] args) {

        LocalTime horasLondres = LocalTime.now(ZoneId.of("Europe/London"));
        System.out.println(Clock.systemDefaultZone()); 
        System.out.println(Clock.systemUTC());

        System.out.println(horasLondres);
        System.out.println(Clock.systemDefaultZone().getZone().getId());


    }
/* 
φ(x0)
-------
∀xφ(x) 

∀xφ(x)
--------
φ(t) 

φ(t)
------
∃xφ(x)

∃xφ(x)  [φ(x0)]u
            ...
            γ
---------------
     γ 



(a) ¬∃x¬φ ⊢ ∀xφ
(b) ¬∀x¬φ ⊢ ∃xφ
(c) φ → ψ ⊢ (¬φ) ∨ ψ

a) ¬∃x¬φ 

        ¬φ
¬∃x¬φ ∃x¬φ 
----------
    abs
x0φ  
∀xφ
 */

}
