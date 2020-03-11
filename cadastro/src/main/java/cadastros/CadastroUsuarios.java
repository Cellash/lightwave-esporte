package cadastros;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CadastroUsuarios {


    private List<Atleta> cadastroAtletas = new ArrayList<>();

    public boolean CadastraAtleta(Atleta atleta){
        if (Objects.isNull(atleta)) return false;
        for (Atleta temp: cadastroAtletas){
            if (temp.getEmail() == atleta.getEmail()){
                return false;
            }
        }
       return cadastroAtletas.add(atleta);
    }



    public int informaQuantidadeCadastrados(){
       return cadastroAtletas.size();
    }

    public Atleta cadastro(int i){
        return cadastroAtletas.get(i);
    }

}


