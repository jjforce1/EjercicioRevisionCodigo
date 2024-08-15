
/*Declarar la API*/
const baseEndpoint = 'https://api.github.com';
const usersEndpoint = `${baseEndpoint}/users`;
const $n = document.querySelector('.name'); // Se agregó . para referirse a la clase "name"
const $b = document.querySelector('#blog');
const $l = document.querySelector('.location'); 

const functiondisplayUser = async (username) => { /*Se añadio el const y el async a la funcion*/
  $n.textContent = 'cargando...'; 

  const response = await fetch(`${usersEndpoint}/${username}`);
  console.log(data);
  $n.textContent = '${data.name}';
  $b.textContent = '${data.blog}';
  $l.textContent = '${data.location}';
}

function handleError(err) {
  console.log('OH NO!');
  console.log(err);
  n.textContent = `Algo salió mal: ${err}`
}

displayUser('stolinski').catch(handleError);
