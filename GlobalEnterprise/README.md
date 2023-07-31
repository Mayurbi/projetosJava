# GlobalEnterprise

Link do video: https://www.youtube.com/watch?v=WlTHkeeB8p0


Link do diagrama: https://lucid.app/lucidchart/d9048d8a-00d1-4e3a-ab79-bb24a9766a58/edit?invitationId=inv_a8379145-d19d-4850-bec4-13da6f2f083d



SouLutions
Lista de endpoints
-/usuario

METHOD: GET

HEADER: Content-Type: application/json Authorization: Bearer {chave de identificação do usuário da SouLutions}

200 OK - caso aparecam os usuários; 204 No Content - caso não existam usuários cadastrados; 401 Unauthorized - caso não esteja logado; 500 Internal Server Error - caso dê qualquer erro inesperado.

Descrição: Devolve todos os usuários cadastrados

-/organizacoes

METHOD: GET

HEADER: Content-Type: application/json Authorization: Bearer {chave de identificação do usuário da SouLutions}

200 OK - caso aparecam os usuários; 204 No Content - caso não existam organizações; 401 Unauthorized - caso não esteja logado; 500 Internal Server Error - caso dê qualquer erro inesperado.

Descrição: Devolve todas os organizações cadastradas

-/usuario/{id}

METHOD: GET

HEADER: Content-Type: application/json Authorization: Bearer {chave de identificação do usuário da SouLutions

200 OK - caso apareca o usuário escolhido; 204 No Content - caso não existam usuários cadastrados; 401 Unauthorized - caso não esteja logado; 500 Internal Server Error - caso dê qualquer erro inesperado.

Descrição: Devolve o usuário cujo id é recebido do path

-/usuario;

METHOD: POST

HEADER: Content-Type: application/json Authorization: Bearer {chave de identificação do usuário da SouLutions}

BODY: {     "messages": [         { "role": {emissor da mensagem}, "content": {conteúdo} },         { "role": {emissor da mensagem}, "content": {conteúdo} },         { "role": {emissor da mensagem}, "content": {conteúdo} },         ...     ] }

200 OK - caso a mensagem tenha sido enviada e respondida; 400 Bad Request - caso dê algum erro na emissão do cabeçalho ou do corpo da requisição; 401 Unauthorized - caso não esteja logado; 500 Internal Server Error - caso dê qualquer erro inesperado e quando a OpenAI API responder com um código 500.

Descrição: Servirá como intermediário entre o usuário e a OpenAI API.

-/usuario;

METHOD: PUT

HEADER: Content-Type: application/json Authorization: Bearer {chave de identificação do usuário da SouLutions}

BODY: {     "messages": [         { "role": {emissor da mensagem}, "content": {conteúdo} },         { "role": {emissor da mensagem}, "content": {conteúdo} },         { "role": {emissor da mensagem}, "content": {conteúdo} },         ...     ] }

200 OK - caso o usuário tenha sido atualizado 400 Bad Request - caso dê algum erro na atualização do usuário; 401 Unauthorized - caso não esteja logado; 500 Internal Server Error - caso dê qualquer erro inesperado e quando a OpenAI API responder com um código 500.

Descrição: Servirá como intermediário entre o usuário e a OpenAI API.

-/login;

METHOD: POST

HEADER: Content-Type: application/json

BODY: {     "emailUsuario": "email@email.com",     "senhaUsuario": "senhaUsuario123" }

200 OK - caso exista um usuário com o email e senha fornecidos; 400 Bad Request - caso dê algum erro na emissão do cabeçalho ou do corpo da requisição e não exista um usuário com o email e senha fornecidos; 500 Internal Server Error - caso dê qualquer erro inesperado.

Descrição: Este endpoint permite que o usuário faça login em sua conta.
