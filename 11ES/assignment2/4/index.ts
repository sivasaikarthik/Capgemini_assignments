function add_positivenos_async(n1, n2) {
      let p = new Promise(function (resolve, reject)
      {
         if (n1 >= 0 && n2 >= 0) {
            //do some complex time consuming work
            resolve(n1 + n2)
         }
         else
            reject('NOT_Postive_Number_Passed')
      })

      return p;
   }
   //Promise.all(iterable)

Promise.all([add_positivenos_async(10,20),add_positivenos_async(30,40),add_positivenos_async(50,60)])
   .then(function(resolveValue){
      console.log(resolveValue[0])
      console.log(resolveValue[1])
      console.log(resolveValue[2])
      console.log('all add operations done')
   })
   .catch(function(err){
      console.log('Error',err)
   })
   console.log('end');