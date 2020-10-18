<?php

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', function () {
    return view('main');
});

Auth::routes();

Route::get('/home', 'HomeController@index')->name('home');

Route::get('/articles', 'ArticleController@index')->name('article');


Route::group(['middleware' => ['auth']], function () {
    Route::get('/create', 'ArticleController@create')->name('create');
    Route::post('/store', 'ArticleController@store')->name('store');
    Route::post('/update', 'ArticleController@update')->name('update');
    Route::get('/articles/{article}', 'ArticleController@show')->name('detail');
    Route::get('/articles/{article}/edit', 'ArticleController@edit')->name('edit');
    Route::get('/articles/delete/{article}', 'ArticleController@destroy')->name('delete');
});
