new Vue({
    el: '#app',
    data: {
        contatos: [],
        contato: {}
    },

    methods: {
        getContatos() {
            axios.get('http://localhost:8080/listar').then(response => {
                this.contatos = response.data
            }).catch(error => {
                console.log(error)
            })
        },

        onSubmit() {
            axios.post('http://localhost:8080/adicionarcontato', this.contato).then(response => {
                console.log(response)
            }).catch(error => {
                console.log(error)
            })
        }
    },

    alterarContato(){
        
    }
    mounted() {
        this.getContatos();

    },
    updated() {
        this.getContatos();
    },

});