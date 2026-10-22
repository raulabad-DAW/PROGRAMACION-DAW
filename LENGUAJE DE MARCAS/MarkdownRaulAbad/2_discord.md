# Documentació del Bot de Discord
![Logotip de Discord](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSenb6y-Ih37BFSYsx4hKTIb04tqn8RbdtCanCyHSdi_vgBbj2bEV8eQywN&s=10)

Pots registrar la teva aplicació al [Portal de Desenvolupadors de Discord](https://discord.com/developers/applications)

Per fer que el bot respongui, escoltem l'esdeveniment `messageCreate` i utilitzem el mètode `message.reply()`

```JavaScript
client.on('messageCreate', message => {
if (message.content === 'ping') {
message.reply('pong!');
}
});
```