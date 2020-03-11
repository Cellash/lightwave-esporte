package cadastros;

import org.junit.Assert;
import org.junit.Test;

public class AtletaTest {

    @Test
    public void testaCriacaoAtleta(){
        Atleta novoAtleta = new Atleta("Erickson","Tulio",10102010,"huhuahuaha",1.90,85.0);
        CadastroUsuarios cadastroUsuarios = new CadastroUsuarios();
        cadastroUsuarios.CadastraAtleta(novoAtleta);
        Assert.assertEquals(cadastroUsuarios.informaQuantidadeCadastrados(), 1);
        Atleta novoAtleta2 = new Atleta("Alexsander", "Oliveira", 10101010, "hauahua",1.80, 70.0);
        cadastroUsuarios.CadastraAtleta(novoAtleta2);
        Assert.assertEquals(cadastroUsuarios.informaQuantidadeCadastrados(), 2);


    }

    @Test
    public void testNaoAceitaDuplicatas(){
        CadastroUsuarios cadastroUsuarios = new CadastroUsuarios();
        Atleta novoAtleta3 = new Atleta("Erickson","Tulio", 10102010,"huhuahuaha",1.90,85.0);
        cadastroUsuarios.CadastraAtleta(novoAtleta3);
        Atleta novoAtleta = new Atleta("Erickson","Tulio",10102010,"huhuahuaha",1.90,85.0);
        cadastroUsuarios.CadastraAtleta(novoAtleta);
        Assert.assertSame(1, cadastroUsuarios.informaQuantidadeCadastrados());
    }


}
