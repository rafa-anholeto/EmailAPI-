# EmailAPI
<p> Criação de uma api simples de envio de e-mails, sem muitas regras por enquanto, continuarei implementando!


Criação com intuíto de ***estudo*** de mensageria assíncrona, utilizando Java com linguagem e o SMPT do Google.

> O que ainda será implementado:

- [x] Serviço de email funcionando com Docker e RabbitMQ
- [ ] Criação de uma classe Books, onde será informado vários dados dos mesmos.
- [ ] Implementação do serviço de e-mail com o serviço da classe Books, onde o RabbitMQ irá avisar quando o livro desejado aparecer com estoque positivo.

--------------------------


Payload do postMapping no Postman e no RabbitMQ utilizado foi esse:
  
```  
{
    "ownerRef": "Rafael",
    "emailFrom": "anholetorafael1@gmail.com",
    "emailTo": "qualquerEmail@gmail.com",
    "subject": "Envio via Mensageria 2",
    "text": "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse maximus est neque, eu auctor risus tempor condimentum. Proin tempus cursus nisi a euismod. Vivamus pretium id tellus nec pulvinar." 
}
 ```
 
_________________
 
 > ***Imagem do RabbitMQ criada no docker com o docker-compose.yml.***

![docker](https://user-images.githubusercontent.com/85499983/187453403-16ea1195-1dd3-4751-9d39-5541b76fb323.png)
 
 > ***E-mail enviado utilizando o RabbitMQ.***

![Captura de tela 2022-08-30 103717](https://user-images.githubusercontent.com/85499983/187451843-a06778e3-31ee-4f98-a503-dd590dfc8156.png)
 
 **TECNOLOGIAS UTILIZADAS:**
 
 <p align="center">
 <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg" height=100 />
 <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original-wordmark.svg" height=100 />
 <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/postgresql/postgresql-original-wordmark.svg" height=100 />
 <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/docker/docker-original-wordmark.svg" height=100/>
 <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/apache/apache-original-wordmark.svg" height=100 />
 <img src="https://upload.wikimedia.org/wikipedia/commons/7/71/RabbitMQ_logo.svg" height=30, width=150/>
          
          
          
 </p>
          
          
  
  


</p>
