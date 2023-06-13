let  url = 'https://dummyjson.com/products';

    function fetchCall(){
        fetch(url)
            .then(response =>{
                if (response.ok){
                    response.json()
                }
            })
            .then(value => dataConverter(value))
            .catch((err => controlError(err)))
    }
    function dataCoverter(param){
        for (let i = 0; i < param.length; I++){
            console.log(data)
        }
    }