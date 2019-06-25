# Gurpo SyncWe
## Projeto Lume 

![Logo Lume](Lume.png)

--- 

# Como utilizar
Devido as limitações do hardware ultilizado e sua comunicação com o java, o projeto separado em várias partes, primeiramente precisa ter o setup montado, depois deve-se rodar o código do java. 

## Setup 
Para a melhor ultilização é necessário ter umas raspberry com o circtuito dos botões criados, e conectado ao arduino, que vai conter o a capa do botão feito com papel aluminio ou grafite, para realizar o feedback por voz. A raspberry deve ter instalado o o java 8 para rodar a aplicação. 
Para rodar o teclado em java é necessário um computador com o java 8 instalado .

## Teclado 
Para rodar o teclado deve-se abrir a pasta teclado > src > teclado e rodar o arquivo Teclado.java, ele incializa um teclado default e usando as teclas: (a,w,s,e,d,f,t,g,yh,u,j) podemos tocar o teclado, para a mudança de oitava pressiona-se os botões "m" ou "n" e para trocar o timbre os botões "z", "x", "c", "v".

## Raspberry 
Para  rodar na raspberry deve montar o circuito em arduino das capas dos botões e montar na rasp o circuito dos botões. E agora tem que tomar cuidado pois o codigo é muito pesado e é muito provável que trave a raspberry, então tome cuidado quando por o código em java para rodar na raspberry. 




