function validaLogin() {

    let usertxt = localStorage.getItem("userlogged");
    if(!usertxt){
        window.location ="index.html"
    }
    
    let user = JSON.parse(usertxt);

    document.getElementById("user").innerHTML = `Nome: ${user.nome}               <br> RACF: ${user.racf} `
    document.getElementById("foto").innerHTML = `<img src=${user.linkFoto}>`

}

function logout() {
    localStorage.removeItem("userlogged");
    window.location ="index.html"
    
}

function gerarRelatorio() {

    //let dataInicio = document.getElementById("dataInicio").value
//    let dataFinal = document.getElementById("dataFinal").value

  //  console.log(dataInicio)
    //console.log(dataFinal)

    fetch("http://localhost:8080/usuarios/all")
        .then(res => tratarResposta(res))
        
    
}

function tratarResposta(resposta){
    if(resposta){
        resposta.json().then(res => exibirDados(res))
    }


}

function exibirDados(listaUsuarios){
    let tabela = '<table class="table table-sm"> <tr> <th>nome</th> <th>email</th> <th>RACF</th>  </tr>'
    for(i=0; i< listaUsuarios.length; i++){
        tabela = tabela +`<tr> <td>${listaUsuarios[i].nome} </td> <td> ${listaUsuarios[i].email} </td> <td> ${listaUsuarios[i].racf}</td>  </tr>`

    }

        tabela = tabela + '</table>'
        document.getElementById("tabela").innerHTML = tabela
}