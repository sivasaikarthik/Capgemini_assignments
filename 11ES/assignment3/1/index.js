var $___60_compileSource_62___ = (function () {
    "use strict";
    var __moduleName = "<compileSource>";

    function add_positivenos_async(n1, n2) {
        var p = new Promise(function (resolve, reject) {
            if (n1 >= 0 && n2 >= 0) {
                resolve(n1 + n2);
            } else
                reject('NOT_Postive_Number_Passed');
        });
        return p;
    }
    Promise.all([add_positivenos_async(10, 20), add_positivenos_async(30, 40), add_positivenos_async(50, 60)]).then(function (resolveValue) {
        console.log(resolveValue[0]);
        console.log(resolveValue[1]);
        console.log(resolveValue[2]);
        console.log('all add operations done');
    }).catch(function (err) {
        console.log('Error', err);
    });
    console.log('end');
    return {};
})();
//# sourceURL=<compileSource>
